int leftx = 200;
int leftSpeed = 1;
int rightx = 300;
int rightSpeed = -1;
void setup(){
size(500,500); 
noFill();
}
void draw(){
  background(225);
for (int i = 25; i > 0; i--){
  ellipse(leftx,250,i*8,i*8);
  
  ellipse(rightx,250,i*8,i*8);
}  
leftx += leftSpeed ; 
if (leftx>500){
  leftSpeed= -1;
  
}
if (leftx<0){
  leftSpeed= 1;
}
rightx += rightSpeed;
if (rightx<0){
 rightSpeed = 1; 
}
if (rightx>500){
 rightSpeed =-1; 
}
}
