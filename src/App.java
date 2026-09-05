public class App {
    public static void main(String[] args) throws Exception {
        int ika = 50;   

// Tulostusehdot   

if (ika >= 0 && ika < 18)   

   {   

     System.out.println("Olet alaikäinen");   

   }   

   else   

   {   

     System.out.println("Olet aikuinen");   

   }

   if (ika > 0 && ika < 18)  
  {  
     System.out.println("Olet alaikäinen");  
  } 
  else if (ika >= 65)  
  {  
     System.out.println("Olet eläkeläinen");  
  } 
  else  
  {  
     System.out.println("Olet aikuinen"); 
  }  

  if (ika > 00 && ika < 18) { 

System.out.println("Olet alaikäinen"); 

if (ika >= 15) { 

System.out.println("Saat ajaa mopoa"); 
} 

} 
else if (ika >= 65) { 

System.out.println("Olet eläkeläinen"); 

} else { 

System.out.println("Olet aikuinen"); 

  } 

  // Laajenna ohjelmaa siten, että ohjelma osaa kertoa 16-17-vuotiaille, että he voivat ajaa kevaria. 

  if (ika > 15 && ika < 18) {
    System.out.println ("Saat ajaa kevaria");
  }

  // Laajenna ohjelmaa niin, että se kertoo 18-vuotiaalle, että hän on juuri tullut täysi-ikäiseksi ja saa ajaa autoa.
  if (ika >= 18) {
    System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa");
  }

  // Laajenna tehtävää niin, että aikuisille ilmoitetaan tasavuosikymmenistä onnentoivotus.
  if (ika >= 20 && ika % 10 == 0) {
    System.out.println("Onnea tasavuosikymmenestä");
} 

// jos ikä on 100, tulosta 3-rivinen onnentoivotus. 
if (ika == 100) {
  System.out.println("Onnea");
  System.out.println("100-vuotis");
  System.out.println("juhlapäivänä");
}

// Tarkenna eläkeasioita siten, että yli 58-vuotiaille kerro, että he voivat mennä varhaiseläkkeelle.
if (ika >= 58) {
  System.out.println("voitte mennä varhaiseläkkeelle");
}

// Toivota 65-vuotiaille hyviä eläkepäiviä.

if (ika == 65) {
  System.out.println("Hyviä eläkepäiviä");
}

// 40–50 -vuotiaille toivota parasta keski-ikää.

if (ika >= 40 && ika <= 50) {
  System.out.println("parasta keski-ikää");
}

    }
  }

