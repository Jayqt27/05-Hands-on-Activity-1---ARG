import java.util.Scanner;

class BloodData {
    private String bloodType; 
    private String rhFactor;

    public BloodData() {
        bloodType = "O"; 
        rhFactor = "+";
    }

    public void setBloodType(String bt) {
        bloodType = bt;
    }

    public void setRhFactor(String rh) {
        rhFactor = rh;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void display() { 
        System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank.");
    } 
}

public class RunBloodData {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        
        String bt; 
        String rh; 
        BloodData bd = new BloodData(); 

        System.out.print("Enter blood type of patient: "); 
        bt = scan.nextLine().trim(); 

        bd.setBloodType(bt); 

        System.out.print("Enter Rhesus factor (+ or -): "); 
        rh = scan.nextLine().trim(); 

        bd.setRhFactor(rh); 

        bd.display(); 
        
        scan.close(); 
    } 
}