DROP TABLE IF EXISTS PRODUCT;
CREATE TABLE PRODUCT (
  id varchar(9) NOT NULL,
  name varchar(50) NOT NULL,
  description varchar(255) DEFAULT NULL,
  price float DEFAULT NULL,
  update_timestamp timestamp NULL DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB;
