package Task1.taskk;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class Tax {

        private Map<String ,Double> taxMap;

        public Tax() {

            this.taxMap = new HashMap<>();
        }


    public void addTax(String taxName, double taxPercentage) {

            taxMap.put(taxName, taxPercentage);
        }

        public double getTaxPercentage(String taxName) {
            return taxMap.getOrDefault(taxName, 0.0);
        }



}
