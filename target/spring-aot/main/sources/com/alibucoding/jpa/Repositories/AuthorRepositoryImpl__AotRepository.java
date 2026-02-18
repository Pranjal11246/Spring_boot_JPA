package com.alibucoding.jpa.Repositories;

import com.alibucoding.jpa.models.Author;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link AuthorRepository}.
 */
@Generated
public class AuthorRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public AuthorRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link AuthorRepository#findAllByFirstname(java.lang.String)}.
   */
  public List<Author> findAllByFirstname(String fn) {
    String queryString = "SELECT a FROM Author a WHERE a.firstname = :fn";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("fn", fn);

    return (List<Author>) query.getResultList();
  }

  /**
   * AOT generated implementation of {@link AuthorRepository#findAllByFirstnameIgnoreCase(java.lang.String)}.
   */
  public List<Author> findAllByFirstnameIgnoreCase(String fn) {
    String queryString = "SELECT a FROM Author a WHERE UPPER(a.firstname) = UPPER(:fn)";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("fn", fn != null ? fn.toUpperCase() : fn);

    return (List<Author>) query.getResultList();
  }
}
