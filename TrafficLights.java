package Sonntag;

public class TrafficLights {
    Boolean redLight = true;
    Boolean yellowLight = false;
    Boolean greenLight = false;
    int stepNumber = 0;
    public void step() {
            switch(stepNumber){
                case 0: stepNumber++;
                case 1: yellowLight = true; stepNumber++; break;
                case 2: redLight = false; yellowLight = false; greenLight = true; stepNumber++; break;
                case 3: yellowLight = true; greenLight = false; stepNumber++; break;
                case 4: yellowLight = false; redLight = true; stepNumber = 0; break;
            }
            }
        public String toString() {
            return "Red light "+redLight+" yellow Light "+yellowLight+" green light "+greenLight;
        }
    }