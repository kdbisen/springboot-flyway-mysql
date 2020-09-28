DELIMITER //

CREATE procedure CalcIncome ( OUT ending_value INT )

BEGIN

   DECLARE income INT;

   SET income = 50;

   label1: WHILE income <= 3000 DO
     SET income = income * 2;
   END WHILE label1;

   SET ending_value = income;

END; //

DELIMITER ;