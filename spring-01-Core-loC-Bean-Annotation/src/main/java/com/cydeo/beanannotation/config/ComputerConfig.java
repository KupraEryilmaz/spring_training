package com.cydeo.beanannotation.config;

import com.cydeo.beanannotation.casefactory.Case;
import com.cydeo.beanannotation.casefactory.DellCase;
import com.cydeo.beanannotation.monitorfactory.AcerMonitor;
import com.cydeo.beanannotation.monitorfactory.Monitor;
import com.cydeo.beanannotation.monitorfactory.SonyMonitor;
import com.cydeo.beanannotation.motherboardfactory.AsusMotherBoard;
import com.cydeo.beanannotation.motherboardfactory.MotherBoard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean
    public Monitor MonitorSony(){
        return new SonyMonitor("25 inch Beast","Sony",25);
    }
    @Bean(name = "sony2")
    public Monitor MonitorSony2(){
        return new SonyMonitor("40 inch Beast","Sony",40);
    }
    @Bean
    @Primary
    public Monitor AcerMonitor(){
        return new AcerMonitor("23 inch Beast","Acer",23);
    }
    @Bean
    public Case caseDell(){
        return new DellCase("220B","Dell","240");
    }
    @Bean
    public MotherBoard motherBoardAsus(){
        return new AsusMotherBoard("BJ200","Asus",4,6,"v2.44");
    }



}
