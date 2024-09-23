class TestStudent {

    public static void main(String[] args) {
        Student alexBalduci = new Student();
		Student angelBianchi = new Student();
		Student andreaBracci = new Student();
		
        alexBalduci.build("Alex" , "Balducci" , 1015 , 2019);
        alexBalduci.printStudentInfo();
		
		angelBianchi.build("Angel" , "Bianchi" , 1016 , 2018);
        angelBianchi.printStudentInfo();
		
		andreaBracci.build("Andrea" , "Bracci" , 1017 , 2017);
        andreaBracci.printStudentInfo();
    }
}
