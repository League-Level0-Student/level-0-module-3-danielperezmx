void setup(){
  size(500,500);


for (int i = 8; i > 0; i--) {
  if (i%2==0){
    fill(#FF0303);
    
  }else{ fill(#000000);
  }
  ellipse(250,250,i*40, i*40);
}
}
void draw(){
}
