public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        public void setName(String name){
                this.name = name;
        }
        public String getName(){
                return name;
        }
        public void setStudentId(int studentId){
                this.studentId = studentId;
        }
        public int getStudentId(){
                return studentId;
        }
        private void setNumberOfCredits(int numberOfCredits){
                this.numberOfCredits = numberOfCredits;
        }
        public int getNumberOfCredits(){
                return numberOfCredits;
        }
        public void setGpa(double gpa){
                this.gpa = gpa;
        }
        public double getGpa(){
                return gpa;
        }

        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public Student(String name, int studentId, int numberOfCredits, double gpa){
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }


}
