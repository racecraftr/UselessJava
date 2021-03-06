package UselessJava.days.Day043

import java.util.*

class Day43K {

    private val isWednesday: Boolean
        get(){
            val c = Calendar.getInstance()
            val day = c.get(Calendar.DAY_OF_WEEK)
            return (day == Calendar.WEDNESDAY)
        }

    val isItWednesday: String
        get(){
            if(!isWednesday){
                return "It is not wednesday"
            }
            return """It is wednesday my dudes
                                                                                                                          
                                                                                                ░░░░▒▒░░                  
                                                                                              ▒▒▒▒▒▒▒▒▒▒▒▒░░              
                                                                                            ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒              
                                                                                      ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░    
                                                                              ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░  
                                                                      ░░░░▒▒▒▒▒▒░░░░░░░░░░░░░░░░▒▒▒▒▒▒░░░░░░▒▒▒▒▓▓▓▓▓▓▓▓▒▒
                                                  ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓▒▒▒▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒
                                              ░░░░░░░░░░░░░░░░▒▒▒▒░░░░░░░░░░▒▒▒▒░░░░░░░░▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒
                                          ░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓████▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒
                                      ░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓████▒▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▒▒▒▒  
                                  ░░░░░░░░░░░░▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒░░▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒    
                                ░░░░░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒░░    
                              ░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▓▓▒▒▓▓▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▒▒░░▒▒▒▒▒▒░░        
                            ░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▓▓▓▓▓▓▒▒░░░░░░▒▒▓▓▒▒            
                          ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒░░░░▒▒▓▓▓▓▒▒░░            
                        ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▒▒▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▓▓▒▒░░░░▒▒▓▓▓▓▒▒░░░░            
                  ░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓░░░░░░▒▒▒▒▒▒▒▒▒▒░░░░              
    ░░░░░░░░    ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒░░▒▒▓▓▓▓▒▒▒▒▒▒▒▒░░░░░░                
  ░░▒▒▒▒░░░░░░░░▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒░░░░░░░░                  
░░▒▒▒▒▒▒▒▒░░░░░░▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒░░░░░░░░░░                    
  ▒▒▒▒▒▒▒▒░░░░░░░░▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░░░▒▒░░░░░░                      
  ▒▒▒▒▒▒▒▒░░░░░░░░▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒░░░░░░░░                          
  ░░░░▒▒░░░░▒▒░░░░▒▒░░░░▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒░░░░▓▓▒▒                          
    ▒▒░░▒▒░░▒▒░░░░░░▒▒░░░░▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▒▒                        
    ░░░░▒▒░░▒▒▒▒░░░░▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒░░▒▒▒▒▒▒▓▓▒▒▒▒░░░░░░▒▒▒▒░░░░▒▒▒▒▒▒░░
    ░░▒▒░░▒▒░░▒▒▒▒░░░░▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░
    ░░▒▒░░░░░░▒▒▒▒░░░░▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒░░▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░      
    ░░▒▒░░░░░░▒▒▒▒▒▒░░▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒░░          
    ░░░░▒▒░░▒▒▒▒▒▒▒▒▒▒░░▒▒░░▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▓▓▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░▒▒░░        
    ░░░░░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒░░░░░░░░▒▒▒▒▒▒▒▒▒▒░░░░    ░░▒▒░░    
      ░░░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒░░░░░░░░░░░░▒▒▒▒░░
      ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░    ░░▒▒▒▒▒▒▒▒        ░░▒▒▒▒  
        ░░░░░░▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓████▓▓▓▓▒▒▒▒▒▒░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒░░░░░░░░░░░░░░░░      ░░░░░░                  
        ░░░░▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒░░░░░░░░░░░░░░                              
          ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▓▒▒░░░░░░░░░░░░░░                              
          ░░░░▒▒░░▓▓▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓░░░░░░░░░░░░░░                              
            ░░░░▒▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░                              
              ░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓▓▓▓▓░░░░░░░░░░░░                              
              ▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▓▓▓▓▓▓▒▒░░░░░░░░░░                              
          ░░▒▒▒▒░░▒▒▒▒▓▓▓▓▓▓▒▒▒▒░░░░░░░░        ░░    ░░░░░░░░░░░░░░▒▒▒▒▒▒▓▓▓▓▓▓▒▒░░░░░░                                  
        ░░░░▒▒░░░░▒▒▒▒▓▓▓▓▒▒▒▒░░░░░░░░                            ░░░░▒▒▒▒▓▓▓▓▓▓▒▒░░░░                                    
      ░░▒▒▒▒▒▒  ░░▒▒▒▒▓▓▓▓░░░░░░░░░░                                ░░▒▒▒▒▒▒▓▓▓▓▓▓░░░░    ░░░░░░                          
        ░░░░░░░░░░▒▒▒▒▓▓▒▒░░░░░░                                      ░░▒▒▒▒▓▓▓▓▒▒▓▓      ▒▒▒▒░░                          
                  ░░▒▒▒▒▒▒▒▒                                          ░░░░▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒                            
                  ░░▒▒▒▒▒▒▒▒                                          ░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                              
                  ░░░░░░                                              ░░░░░░▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒░░                            
                  ▒▒▒▒▒▒                                              ░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒░░░░░░▒▒▒▒░░░░          
                  ▒▒▓▓▒▒                                                ░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒          
                                                                            ░░░░░░▒▒▒▒▒▒▒▒▒▒░░░░            ░░░░          
                                                                                    ░░░░▒▒▒▒░░                            
                                                                                      ░░▒▒▒▒▒▒                            
                                                                                        ░░▒▒▒▒░░                          
                                                                                            ▒▒▒▒▒▒                        
                                                                                            ░░▒▒▒▒                        
"""
        }
}

@kotlin.jvm.Throws
fun main(){
    val d = Day43K()
    while(true){
        println(d.isItWednesday)
        Thread.sleep(1000 * 5)
    }
}