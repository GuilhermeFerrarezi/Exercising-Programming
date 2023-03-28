<?php
$count =0;
$file = fopen("nome.txt","r");
while (!feof($file)){
	while($char = fgetc($file)){
		$count++;
	}
}
echo "<br> A quantidade de caracteres foi de: ".$count;
fclose($file);
?>
