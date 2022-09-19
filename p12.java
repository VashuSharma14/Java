class Bank{
 double roi;
 double getROI(){
 roi=2.0;
 return roi; } }
class HDFC extends Bank{
 double getROI(){
 roi=4.0;
 return roi; }}
 class SBI extends BanK{
 double getROI(){
 roi=4.5;
 return roi;}}
class PNB extends Bank{
 double getROI() {
 roi=5.0;
 return roi;}}	
class last_bank {
 public static void main(String args[]) { 
 //upcasting 
 Bank obj =new HDFC();
 System.out.println(obj.getROI());
 obj =new SBI();
 System.out.println(obj.getROI());
 obj =new HDFC();
 System.out.println(obj.getROI()); } }
