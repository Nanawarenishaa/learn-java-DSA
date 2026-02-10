class student {
    int rollNo;
    String Name;

    public student(int r,String n) {
        rollNo=r;
        Name=n;
    }
    void display(){
        System.err.println("Student rollNo:"+rollNo);
        System.err.println("Student Name:"+Name);
    }
    public static void main(String[] args) {
        student s1=new student(83,"Nisha");
        s1.display();
    }
}