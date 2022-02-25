insert into PRODUCTS(id, name, description, price, stock, created_date, modified_date) values (1, '치즈버거', '패티, 치즈', '4000원', 10, sysdate(), sysdate());
insert into PRODUCTS(id, name, description, price, stock, created_date, modified_date) values (2, '빅맥', '시그니쳐 버거', '6000원', 11, sysdate(), sysdate());
insert into PRODUCTS(id, name, description, price, stock, created_date, modified_date) values (3, '쿼터파운더', '두꺼운 패티에 치즈', '7000원', 7, sysdate(), sysdate());

insert into USERS(id, username, name, password, phone_number, created_date, last_login_date)
values (1, 'hong123', '홍길동', 'qwerQ1234!', '01012341234', sysdate(), sysdate());