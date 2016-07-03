package com.app.backend.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * created on 20/06/2016
 * @author ksun
 *
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.app.backend.web", "com.app.backend.service", "com.app.backend.json"})
@MapperScan("com.app.backend.dao")
@PropertySource(name="application",value={"classpath:/application.properties"})
@ImportResource(value = {"classpath:/persistence-db.xml"})
@EnableAspectJAutoProxy
@EnableTransactionManagement
@Lazy
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Autowired
    private Environment env;

    
    // -------------- Services -----------------------

    // -------------- Message Converters ----------------------
	
	/*@Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		final SkipNullObjectMapper skipNullMapper = new SkipNullObjectMapper();
        skipNullMapper.init();
        final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        //converter.setObjectMapper(skipNullMapper);
        
        converters.add(converter);
    }*/
    // -------------- Serving Resources ----------------------

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**/*.html").addResourceLocations("classpath:/static/");
    }
 
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    
    // -------------- Controllers ----------------------


    // -------------- View Stuff -----------------------

//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//      SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//      sessionFactory.setDataSource(dataSource());
//      return sessionFactory.getObject();
//    }
    
    
    
    @Bean
    public InternalResourceViewResolver viewResolver() {
        final InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(InternalResourceView.class);
        bean.setOrder(999);
        bean.setPrefix("/WEB-INF/");
        bean.setSuffix("");
        return bean;
    }
	
}
