abstract class Course {
    abstract void enroll();
    abstract void getContent();
    abstract void completeModule();
}

class VideoCourse extends Course {
    @Override
    void enroll() {
        System.out.println("Enrolled in Video Course");
    }
    
    @Override
    void getContent() {
        System.out.println("Accessing Video Content");
    }
    
    @Override
    void completeModule() {
        System.out.println("Video Module Completed");
    }
}

class LiveCourse extends Course {
    @Override
    void enroll() {
        System.out.println("Enrolled in Live Course");
    }
    
    @Override
    void getContent() {
        System.out.println("Joining Live Session");
    }
    
    @Override
    void completeModule() {
        System.out.println("Live Session Completed");
    }
}

class TextCourse extends Course {
    @Override
    void enroll() {
        System.out.println("Enrolled in Text Course");
    }
    
    @Override
    void getContent() {
        System.out.println("Reading Text Material");
    }
    
    @Override
    void completeModule() {
        System.out.println("Text Module Completed");
    }
}

public class AC1 {
    public static void main(String[] args) {
        Course video = new VideoCourse();
        video.enroll();
        video.getContent();
        video.completeModule();
        
        Course live = new LiveCourse();
        live.enroll();
        live.getContent();
        live.completeModule();
        
        Course text = new TextCourse();
        text.enroll();
        text.getContent();
        text.completeModule();
    }
}
