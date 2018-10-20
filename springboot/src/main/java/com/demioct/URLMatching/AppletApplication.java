package com.demioct.URLMatching;

import org.springframework.boot.SpringApplication;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 
 *  说明：    定制URL匹配规则的方法
 * 
 * 构建web应用程序时，并不是所有的URL请求都遵循默认的规则。
 * 有时，我们希望RESTful URL匹配的时候包含定界符“.”，
 * 这种情况在Spring中可以称之为“定界符定义的格式”；
 * 有时，我们希望识别斜杠的存在。
 * 
 */

//@SpringBootApplication
public class AppletApplication extends WebMvcConfigurationSupport{

	/**
     * 1、 extends WebMvcConfigurationSupport 
     * 2、重写下面方法; 
     *      setUseSuffixPatternMatch: 设置是否是后缀模式匹配，如“/user”是否匹配/user.*，默认真即匹配； 
     *      setUseTrailingSlashMatch: 设置是否自动后缀路径模式匹配，如“/user”是否匹配“/user/”，默认真即匹配；
     */
	
	/**
	 * setUseSuffixPatternMatch(boolean useSuffixPatternMatch)： 
	 * 设置是否是后缀模式匹配，如“/user”是否匹配/user.*，默认匹配即true； 
	 * 当此参数设置为true的时候，那么/user.html，/user.aa，/user.*都能是正常访问的。 
	 * 当此参数设置为false的时候，那么只能访问/user或者/user/( 这个前提是setUseTrailingSlashMatch 设置为true了)。
	 * 
	 * setUseTrailingSlashMatch (boolean useSuffixPatternMatch)： 
	 * 设置是否自动后缀路径模式匹配，如“/user”是否匹配“/user/”，默认匹配即true； 
	 * 当此参数设置为true的会后，那么地址/user，/user/或者/user? 都能正常访问。 
	 * 当此参数设置为false的时候，那么就只能访问/user了。
	 * 
	 * 当以上两个参数都设置为true的时候，那么路径/user或者/user.aa，/user.*，/user/都是能正常访问的，但是类似/user.html/ 是无法访问的。 
	 * 当都设置为false的时候，那么就只能访问/user路径了。
	 * 
	 * 
	 * */
    @Override
    protected void configurePathMatch(PathMatchConfigurer configurer) {
        configurer
            .setUseSuffixPatternMatch(false)
            .setUseTrailingSlashMatch(true);
    }

    public static void main(String[] args) {
        SpringApplication.run(AppletApplication.class);
    }
}
