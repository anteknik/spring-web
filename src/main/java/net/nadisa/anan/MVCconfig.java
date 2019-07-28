package net.nadisa.anan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan({ "net.nadisa.anan" })
public class MVCconfig extends WebMvcConfigurerAdapter {}