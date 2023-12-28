package com.cydeo;

//import org.flywaydb.core.Flyway;
//import org.flywaydb.core.api.output.MigrateResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class Spring13DataCinemLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring13DataCinemLabApplication.class, args);
    }

//    @Bean(2.kod)
//    public MigrateResult migrateResult(DataSource dataSource){
//        return Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
//    }
    //flyway e  3. tabloyu olusturacagi data source hakkinda manuel olarak yazdigimiz method ile bilgi veriyoruz.
    //dataSource(dataSource) uygulamamizin kullandigi data source
    // daha sonra migration klasoru altina V1.0.1__insertdata.sql file olusturdu(3.) V1.0.0__insertdata.sql diye
    //neden yazmadik.cunku bu baseline flyway.ilk referans noktasi database degisiklikleri baseline version uzerine kaydedilecek.V1.0.0__insertdata.sql flyway icinde olusturuluyor.datayi bu file icine kaydediyoruz.data.sql filemiz yok.Sonrasinda programi calistiriyoruz.Program calistiktan sonra datalar tablellara yukleniyor.database de sql aktivitelerini kaydettigimiz tablomuzda olusuyor.


}
