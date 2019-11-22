package com.example.recycleview;

 class Items {

     private String Title, Name, Date;
     private int screenImg;

     Items(String title, String name, String date, int screenImg){
         this.Title = title;
         this.Name = name;
         this.Date = date;
         this.screenImg = screenImg;
     }

     String getTitle(){
         return Title;
     }
     String getName(){
         return Name;
     }
     String getDate(){
         return Date;
     }
     int getScreenImg(){
         return screenImg;
     }
}
