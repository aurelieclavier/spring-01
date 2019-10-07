package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @RequestMapping("/doctor")
    @ResponseBody
    public String index() {
        return "<h1>Doctor Who incarnation :</h1>"
        		+ "<ul>"
        		+ "<li><a href='doctor/1'>William Hartnell</a></li>"
        		+ "<li><a href='doctor/2'>Patrick Troughton</a></li>"
        		+ "<li><a href='doctor/3'>Jon Pertwee</a></li>"
        		+ "<li><a href='doctor/4'>Tom Baker</a></li>"
        		+ "</ul>";
    }
    
    @RequestMapping("doctor/1")
    @ResponseBody
    public String doctorOne() {
    	return "<img src='https://i2-prod.mirror.co.uk/incoming/article1780638.ece/ALTERNATES/s615/Doctor-Who.jpg'>"
    			+ "<a href='/doctor'>Home</a>";
    }
    
    @RequestMapping("doctor/2")
    @ResponseBody
    public String doctorTwo() {
    	return "<img src='https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/doctor-who-patrick-troughton-1559641041.jpg?crop=1.00xw:0.754xh;0,0.0131xh&resize=480:*'>"
    			+ "<a href='/doctor'>Home</a>";
    }
    
    @RequestMapping("doctor/3")
    @ResponseBody
    public String doctorThree() {
    	return "<img src='https://images.immediate.co.uk/production/volatile/sites/3/2016/10/120924.jpg?quality=45&resize=620,413'>"
    			+ "<a href='/doctor'>Home</a>";
    }
    
    @RequestMapping("doctor/4")
    @ResponseBody
    public String doctorFour() {
    	return "<img src='https://cdn-static.denofgeek.com/sites/denofgeek/files/styles/main_wide/public/tom_baker.jpg?itok=BfCmfFIR'>"
    			+ "<a href='/doctor'>Home</a>";
    }

}