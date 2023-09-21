package SpringMVCDesignPattern2.SpringMVCDesignPattern2.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private int uId;
    private String uName;
    private String uEmailId;
    private long uContNo;
}
