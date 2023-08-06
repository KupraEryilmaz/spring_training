package stereotype_annotation.casefactory;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class DellCase extends Case{
    public DellCase(String model, String manufacture, String powerSupply) {
        super(model, manufacture, powerSupply);
    }

    @Override
    public void pressPowerButton() {

    }
}
