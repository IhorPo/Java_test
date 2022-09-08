package eNum;

public enum Schedule {
    MONDAY(3, "Volleyball"){
        @Override
        public String toString(){
            return activity + " " + hours + " hours";
        }
    },
    TUESDAY(2, "Gym: Back day"){
        @Override
        public String toString(){
            return activity + " " + hours + " hours";
        }
    },
    WEDNESDAY(1, "Swimming"){
        @Override
        public String toString(){
            return activity + " " + hours + " hours";
        }
    },
    THURSDAY(2,"Gym: Chest day"){
        @Override
        public String toString(){
            return activity + " " + hours + " hours";
        }
    },
    FRIDAY(1, "Swimming"){
        @Override
        public String toString(){
            return activity + " " + hours + " hours";
        }
    },
    SATURDAY(2, "Volleyball"){
        @Override
        public String toString(){
            return activity + " " + hours + " hours";
        }
    },
    SUNDAY(12, "Chill"){
        @Override
        public String toString(){
            return activity + " " + hours + " hours";
        }
    };

    final int hours;
    final String activity;

    Schedule(int hours, String activity){
        this.hours = hours;
        this.activity = activity;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
