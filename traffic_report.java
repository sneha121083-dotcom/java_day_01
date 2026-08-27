import java.util.Scanner;
public class traffic_report{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        int speed,speed_limit,age,helmet_stat,seatbelt_stat,lisc_stat;
        String vehicle_no;
        int cnt;
        speed=sc.nextInt();
        speed_limit=sc.nextInt();
        age=sc.nextInt();
        helmet_stat=sc.nextInt();
        seatbelt_stat=sc.nextInt();
        lisc_stat=sc.nextInt();
        vehicle_no=sc.next();
        cnt=0;
        System.out.println("==================================================================");
        System.out.println("                         SMART TRAFFIC ANALYZER                   ");
        System.out.println("==================================================================");

        //vehicle number validation
        if (!vehicle_no.equalsIgnoreCase("none") && !vehicle_no.isEmpty()) {
            System.out.println("Vehicle Number  : " + vehicle_no);
        } else {
            cnt += 1;
        }
        //speed validation
        System.out.println("Speed : "+speed+" km/h");
        System.out.println("Speed Limit: "+speed_limit+" km/h");

        if(speed>speed_limit){
            System.out.println("Excess Speed : "+(speed-speed_limit)+" km/h");
            System.out.println("Speed Status  :  OVERSPEED");
            cnt+=1;
        }

        //helmet status validation
        if(helmet_stat==0){
            System.out.println("Helmet Status  : VALID");
        }else if(helmet_stat==1){
            System.out.println("Helmet Status  : VIOLATION");
            cnt+=1;
        }

        //seatbelt validation
        if(seatbelt_stat==0){
            System.out.println("Seat Belt Status  :  VALID");
        }
        else if(seatbelt_stat==1){
            System.out.println("Seat Belt Status  :  VIOLATION");
            cnt+=1;
        }

        //liscence validation
        if(lisc_stat==0){
            System.out.println("License Status  :  VALID");
        }
        else if(lisc_stat==1){
            System.out.println("License Status  :  VIOLATION");
            cnt+=1;
        }

        //age validation
        if(age<18){
            System.out.println("Age Status  :  MINOR");
            cnt+=1;
        }

        //Fine
        System.out.println("Total Fine : Rs"+cnt*500);

        if(cnt==0){
            System.out.println("Risk Level : LOW");
        }else if(cnt>0 && cnt<=3){
            System.out.println("Risk Level : MEDIUM");
        }else{
            System.out.println("Risk Level : HIGH");
        }
        System.out.println("Violation Flags : " +cnt);

        System.out.println("==================================================================");

    }
}