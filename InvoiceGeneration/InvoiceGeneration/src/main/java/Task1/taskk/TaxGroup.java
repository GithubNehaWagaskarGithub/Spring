package Task1.taskk;
import java.util.List;
import java.util.ArrayList;
public class TaxGroup
{
    private List<String> taxGroup;


    public TaxGroup() {
        //instance of arraylist
        this.taxGroup = new ArrayList<>();
    }

    public void addTaxToGroup(String taxName) {

        taxGroup.add(taxName);
    }

    public List<String> getTaxGroup() {

        return taxGroup;
    }
}
