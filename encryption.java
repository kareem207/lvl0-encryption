    public String encryption (String text){
        
        int counter;
        newText = "";
        
        for(counter = 0 ; counter<text.length() ; counter++){
            
            a = text.charAt(counter);
    
            switch (a){
                case ' ':
                    a = 'g';
                    break;
                case 'k':
                    a = '*';
                    break;
                case 'a':
                    a = 'w';
                    break;
                case 'e':
                    a = '7';
                    break;
                case 'h':
                    a = '8';
                    break;
                case 's':
                    a = 'z';
                    break;
                default:
                    a = text.charAt(counter);
            }
            
            newText = newText+a;
            
        }
        
        return newText;
    }
    
    
    public String decryption (String text){
        
        int counter;
        newText = "";
        for(counter = 0 ; counter<text.length() ; counter++){
            
            a = text.charAt(counter);
    
            switch (a){
                case 'g':
                    a = 'a';
                    break;
                case '*':
                    a = 'k';
                    break;
                case 'w':
                    a = 'a';
                    break;
                case '7':
                    a = 'e';
                    break;
                case '8':
                    a = 'h';
                    break;
                case 'z':
                    a = 's';
                    break;
                default:
                    a = text.charAt(counter);
            }
            
            newText = newText+a;
            
        }
        
        return newText;
    }




}
