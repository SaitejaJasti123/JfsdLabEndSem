package com.model;
import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
public class StudentManager {
  public List<StudentData> retrieveData()throws Exception
  {
    SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Session se=sf.openSession();
    se.getTransaction().begin();
    List<StudentData> list=new ArrayList<StudentData>();
    CriteriaBuilder cb=se.getCriteriaBuilder();
    CriteriaQuery<StudentData>cr=cb.createQuery(StudentData.class);
    Root<StudentData>root=cr.from(StudentData.class);
    cr.select(root);
    //cr.select(root).where(cb.lt(root.get("stuid"),30));
    //cr.select(root).where(cb.gt(root.get("stuid"),30));
    //cr.select(root).where(cb.like(root.get("stuname"),"%n%"));
    //cr.select(root).where(cb.between(root.get("stuid"),30,50));
    TypedQuery<StudentData>qry=se.createQuery(cr);
    
    
    list=qry.getResultList();
    se.getTransaction().commit();
    sf.close();
    se.close();
    return list;
  }

}