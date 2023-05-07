public class Guest {
    private String name;
    private String address;
    private int age;
    private String cpf;

    Guest(String name, String address, int age, String cpf) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCPF() {
    	return cpf;
    }

    public void getGuestDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("CPF: " + cpf);
    }
}
