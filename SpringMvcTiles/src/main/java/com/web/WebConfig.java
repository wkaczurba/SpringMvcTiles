package com.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;
import org.springframework.context.annotation.Bean;

@Configuration
@EnableWebMvc
@ComponentScan("com.web")
public class WebConfig extends WebMvcConfigurerAdapter {
	
	// This is to add resources so they are available at /resources/style.css points to webapp/resources/style.css
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tiles = new TilesConfigurer();
		tiles.setDefinitions(new String[] {
			"/WEB-INF/layout/tiles.xml"
		}); // Note: setDefinitions can also handle "/WEB-INF/**/views/tiles.xml" wildcard.
		tiles.setCheckRefresh(true);
		return tiles;
	}
	
	@Bean
	public ViewResolver viewResolver() {
		TilesViewResolver viewResolver = new TilesViewResolver();

		// InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		// viewResolver.setPrefix("/WEB-INF/views/");
		// viewResolver.setSuffix(".jsp");
		// viewResolver.setExposeContextBeansAsAttributes(true);
		return viewResolver;
	}
}
