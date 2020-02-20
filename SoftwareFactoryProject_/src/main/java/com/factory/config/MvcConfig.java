package com.factory.config;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import com.factory.interceptor.CommonIntercepter;

@SuppressWarnings("deprecation")
@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	/*		解决跨域方法 - 2、处理跨域请求的Configuration	
	 * 		CrossOriginConfig.java
	 * 		继承WebMvcConfigurerAdapter或者实现WebMvcConfigurer接口		*/
    private static final String ORIGINS[] = new String[] { "OPTIONS", "HEAD", "GET", "POST", "PUT", "DELETE", "PATCH" };
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /*														*/
    	registry.addMapping("/**") 			//添加映射路径
        		.allowedOrigins("*") 		//放行哪些原始域
                .allowedHeaders("*")		//放行哪些原始域(头部信息)
        		.allowCredentials(true)		//是否是否允许跨域传cookie(发送cookie信息)
        		.allowedMethods(ORIGINS)	//放行哪些原始域(请求方式) 
        		.maxAge(3600);		//设置缓存时间，减少重复响应	*/
        
    	/*														*
        registry.addMapping("/**")
        		.allowedOrigins("http://localhost:8080")
        		.allowedMethods(ORIGINS) 
        									//"GET","POST", "PUT", "DELETE", "OPTIONS"
        		.allowedHeaders("*") 
        		.allowCredentials(true) 
//      		.exposedHeaders("access-control-allow-headers",
//                      		"access-control-allow-methods",
//                      		"access-control-allow-origin",
//                      		"access-control-max-age",
//                      		"X-Frame-Options") //暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
        		.maxAge(1800);								//	*/
    }
    
	//extends WebMvcConfigurationSupport
	
    @Autowired
	CommonIntercepter commonI;
    
    @Override
	public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则，/**表示拦截所有请求
        // excludePathPatterns 用户排除拦截

    	List<String> pathPattern = new ArrayList<String>();
    	pathPattern.add("/login");
    	
		registry.addInterceptor(commonI).addPathPatterns("/**").excludePathPatterns(pathPattern);
    	WebMvcConfigurer.super.addInterceptors(registry);
    	
        //registry.addInterceptor(loginInterceptor).addPathPatterns("/**")
        //.excludePathPatterns("/stuInfo/getAllStuInfoA","/account/register");    
        //super.addInterceptors(registry);
    }
    
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //和页面有关的静态目录都放在项目的static目录下
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
		//上传的头像图片在D盘>Git>HeadPortraitImages目录下，head表示访问的前缀，以下是真实路径
		registry.addResourceHandler("/head/**").addResourceLocations("file:/D:/Git/HeadPortraitImages/");
		
		//super.addResourceHandlers(registry);	改为实现WebMvcConfigurer接口后必须 注释/删除 这一句
	}

	/*
	
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	// TODO Auto-generated method stub
    	List<String> pathPattern = new ArrayList<String>();
    	pathPattern.add("/login");
    	pathPattern.add("/register");
    	
    	pathPattern.add("/assets/**");
    	pathPattern.add("/css/**");
    	pathPattern.add("/scss/**");
    	pathPattern.add("/umeditor-1.2.3/**");	//百度富文本编辑器下的全部静态文件
    	pathPattern.add("/uploading.css");		//商品编辑页面 抽取出的CSS文件
    	pathPattern.add("/js/**");
    	pathPattern.add("/uploading.js");		//商品编辑页面 抽取出的JS代码
    	
    	pathPattern.add("/images/**");
    	pathPattern.add("/picture/**");
    	pathPattern.add("/head/**");
    	pathPattern.add("/commodity/**");
    	pathPattern.add("/color/**");
    	
    	pathPattern.add("/error");		//这些个error，有点烦
    	
		registry.addInterceptor(loginI).addPathPatterns("/**").excludePathPatterns(pathPattern);
    	WebMvcConfigurer.super.addInterceptors(registry);
    }*/
	
	/**
     * - 修改自定义消息转换器
     * @param converters
     */
	@Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter4 converter = new FastJsonHttpMessageConverter4();
        converter.setSupportedMediaTypes(getSupportedMediaTypes());
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(
            // String null -> ""
            SerializerFeature.WriteNullStringAsEmpty,
            // Number null -> 0
            SerializerFeature.WriteNullNumberAsZero,
            //禁止循环引用
            SerializerFeature.DisableCircularReferenceDetect
        );
        converter.setFastJsonConfig(config);
        converter.setDefaultCharset(Charset.forName("UTF-8"));
        converters.add(converter);
    }

	private List<MediaType> getSupportedMediaTypes() {
        List<MediaType> supportedMediaTypes = new ArrayList<>();
        supportedMediaTypes.add(MediaType.APPLICATION_JSON);
        supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        supportedMediaTypes.add(MediaType.APPLICATION_ATOM_XML);
        supportedMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
        supportedMediaTypes.add(MediaType.APPLICATION_OCTET_STREAM);
        supportedMediaTypes.add(MediaType.APPLICATION_PDF);
        supportedMediaTypes.add(MediaType.APPLICATION_RSS_XML);
        supportedMediaTypes.add(MediaType.APPLICATION_XHTML_XML);
        supportedMediaTypes.add(MediaType.APPLICATION_XML);
        supportedMediaTypes.add(MediaType.IMAGE_GIF);
        supportedMediaTypes.add(MediaType.IMAGE_JPEG);
        supportedMediaTypes.add(MediaType.IMAGE_PNG);
        supportedMediaTypes.add(MediaType.TEXT_EVENT_STREAM);
        supportedMediaTypes.add(MediaType.TEXT_HTML);
        supportedMediaTypes.add(MediaType.TEXT_MARKDOWN);
        supportedMediaTypes.add(MediaType.TEXT_PLAIN);
        supportedMediaTypes.add(MediaType.TEXT_XML);
        return supportedMediaTypes;
    }

}
