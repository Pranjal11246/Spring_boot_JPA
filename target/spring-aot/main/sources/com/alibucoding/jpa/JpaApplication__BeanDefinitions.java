package com.alibucoding.jpa;

import com.alibucoding.jpa.Repositories.AuthorRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link JpaApplication}.
 */
@Generated
public class JpaApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'jpaApplication'.
   */
  public static BeanDefinition getJpaApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JpaApplication.class);
    beanDefinition.setTargetType(JpaApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(JpaApplication.class);
    beanDefinition.setInstanceSupplier(JpaApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'commandlineRunner'.
   */
  private static BeanInstanceSupplier<CommandLineRunner> getCommandlineRunnerInstanceSupplier() {
    return BeanInstanceSupplier.<CommandLineRunner>forFactoryMethod(JpaApplication$$SpringCGLIB$$0.class, "commandlineRunner", AuthorRepository.class, VideoRepository.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("jpaApplication", JpaApplication.class).commandlineRunner(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'commandlineRunner'.
   */
  public static BeanDefinition getCommandlineRunnerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CommandLineRunner.class);
    beanDefinition.setFactoryBeanName("jpaApplication");
    beanDefinition.setInstanceSupplier(getCommandlineRunnerInstanceSupplier());
    return beanDefinition;
  }
}
