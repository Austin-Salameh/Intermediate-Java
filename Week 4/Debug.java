import 
    java.io.*;  
   
 
    class 
    Debug {  
   
 
         
    public 
    static 
    void 
    main(final String[] args)  
   
 
         
    {  
   
 
             
    final StringBuffer str =  
    new 
    StringBuffer( 
    "JavaMaster" 
    );  
   
 
             
    str.insert( 
    5 
    ,  
    "for" 
    );  
   
 
             
    System.out.println(str);  
      
   
 
       
   
 
             
    str.insert( 
    0 
    ,  
    5 
    );  
   
 
             
    System.out.println(str);  
    
 
   
 
       
   
 
             
    str.insert( 
    3 
    ,  
    true 
    );  
   
 
             
    System.out.println(str);  
    
 
   
 
       
   
 
             
    str.insert( 
    5 
    ,  
    41 
    .35d);  
   
 
             
    System.out.println(str);  
    
 
   
 
       
   
 
             
    str.insert( 
    8 
    ,  
    41 
    .35f);  
   
 
             
    System.out.println(str);  
      
   
 
       
   
 
             
    final char 
    java_arr[] = {('p','a','w', 'a','n')};  
   
 
             
    str.insert( 
    2 
    , java_arr);  
   
 
             
    System.out.println(str);  
    
 
   
 
         
    }  
   
 
    }  
