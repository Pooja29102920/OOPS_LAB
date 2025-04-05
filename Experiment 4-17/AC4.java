abstract class HealthMonitor {
    abstract void startTracking();
    abstract void getStats();
    abstract void alert();
}

class HeartRateMonitor extends HealthMonitor {
    @Override
    void startTracking() {
        System.out.println("Heart Rate Monitoring Started");
    }
    
    @Override
    void getStats() {
        System.out.println("Current Heart Rate: 75 BPM");
    }
    
    @Override
    void alert() {
        System.out.println("Heart Rate Alert: Abnormal reading detected!");
    }
}

class SleepTracker extends HealthMonitor {
    @Override
    void startTracking() {
        System.out.println("Sleep Tracking Started");
    }
    
    @Override
    void getStats() {
        System.out.println("Last Night's Sleep: 7 hours");
    }
    
    @Override
    void alert() {
        System.out.println("Sleep Alert: Poor sleep quality detected!");
    }
}

class StepCounter extends HealthMonitor {
    @Override
    void startTracking() {
        System.out.println("Step Counting Started");
    }
    
    @Override
    void getStats() {
        System.out.println("Today's Steps: 10,000");
    }
    
    @Override
    void alert() {
        System.out.println("Step Goal Alert: Daily step goal reached!");
    }
}

public class AC4 {
    public static void main(String[] args) {
        HealthMonitor heartRate = new HeartRateMonitor();
        heartRate.startTracking();
        heartRate.getStats();
        heartRate.alert();
        
        HealthMonitor sleep = new SleepTracker();
        sleep.startTracking();
        sleep.getStats();
        sleep.alert();
        
        HealthMonitor step = new StepCounter();
        step.startTracking();
        step.getStats();
        step.alert();
    }
}
