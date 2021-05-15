
public class main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"c# Kursu","Engin Demiroð",0);
		Product product2 = new Product(2,"py Kursu","Engin Demiroð",0);
		Product product3 = new Product(3,"html Kursu","Engin Demiroð",0);
		
        Students students1= new Students(1,"Murathan","Baktý","crayz_boy_31@türko.com",05313313131);
        Students students2= new Students(2,"kadir","erdem","crayz_boy_58@türko.com",05313313132);
        
        ProductManager productManager = new ProductManager();
        productManager.getToCard(product1);
        productManager.getToCard(product2);
        productManager.getToCard(product3);
        
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(students1);
        studentManager.addStudent(students2);

        		

	
	
	}

	}
