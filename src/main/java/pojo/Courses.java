package pojo;

import java.util.List;

public class Courses {

    private List<CourseDetails> webAutomation;
    private List<CourseDetails> api;
    private  List<CourseDetails> mobile;

    public List<CourseDetails> getWebAutomation(){
        return webAutomation;
    }
    public List<CourseDetails> getApi(){
        return api;
    }
    public List<CourseDetails> getMobile(){
        return mobile;
    }
}
