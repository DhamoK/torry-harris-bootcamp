package Files.model;

import java.io.Serializable;

public class Person implements Serializable,Comparable<Person>{
    private static final long serialVersionUID = 10l;
        private int empId;
        private String name,state,occupation;

        public Person(int empId, String name, String state, String occupation) {
            this.empId = empId;
            this.name = name;
            this.state = state;
            this.occupation = occupation;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        @Override
        public String toString() {
            return  "Person ====>  " +
                    "aadharNumber = " + empId +
                    ", name = " + name  +
                    ", state = " + state +
                    ", occupation = " + occupation +
                    "";
        }

    @Override
    public int compareTo(Person o) {
        return this.empId-o.empId;
    }
}
