<?php
$file = fopen("teste.txt","r");
$file2 = fopen("teste2.txt","w");
while (!feof($file)){
	$linha = fgets($file);
	fwrite($file2, $linha);
}
fclose($file);
fclose($file2);
?>
