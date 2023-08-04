package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Dimension;
import com.cydeo.monitorfactory.Monitor;
import com.cydeo.monitorfactory.SonyMonitor;
import com.cydeo.motherboardfactory.AsusMotherBoard;
import com.cydeo.motherboardfactory.MotherBoard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PcConfig {
    @Bean
    public Dimension dimensions(){
        return new Dimension(50,10,10);
    }
    @Bean
    public Case caseDell(Dimension dimensions){
        return new DellCase("220B","Dell","240",dimensions);
    }
    @Bean
    public Monitor sony(){
        return new SonyMonitor("25 inch beast","Sony",25);
    }
    @Bean
    public MotherBoard motherBoardAsus(){

        return new AsusMotherBoard("BJ200","Asus",4,6,"v2.44");
    }
}
