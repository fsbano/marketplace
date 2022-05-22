package io.fsbano.config;

import de.codecentric.boot.admin.server.config.AdminServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  private final AdminServerProperties adminServer;

  public WebSecurityConfig(AdminServerProperties adminServer) {
    this.adminServer = adminServer;
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests().anyRequest().permitAll()
            .and().csrf().disable();
    /*
    http.authorizeRequests()
      .anyRequest().authenticated()
      .and()
      .oauth2Login();
    */
  }

}
