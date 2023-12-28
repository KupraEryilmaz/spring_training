drop table if exists employees;
-- yukaridaki kodu yazmazsak program hata verir.Bu kod ile var olan table siliniyor.Yerine yenisi olusturulur.Aksi halde table mevcut hatasi verir.
create table EMPLOYEES(

                          id bigint not null,
                          name varchar(255),
                          primary key (id)


);
