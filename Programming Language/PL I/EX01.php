<?php

$i=576;
$n100 =0;
$n50=0;
$n20=0;
$n10=0;
$n5=0;
$n2=0;
$n1=0;

for($i;($i-100)>=0;$i-=100,$n100++){
}
for($i;($i-50)>=0;$i-=50,$n50++){
}
for($i;($i-20)>=0;$i-=20,$n20++){
}
for($i;($i-10)>=0;$i-=10,$n10++){
}
for($i;($i-5)>=0;$i-=5,$n5++){
}
for($i;($i-2)>=0;$i-=2,$n2++){
}
for($i;($i-1)>=0;$i-=1,$n1++){
}
echo "Serão necessárias $n100 notas de 100, $n50 notas de 50, $n20 notas de 20, $n10 notas de 10, $n5 notas de 5, $n2 notas de 2 e $n1 moedas de 1 real";

?>
