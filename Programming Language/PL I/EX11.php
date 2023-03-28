<?php
$count =0;
$file = fopen("nome.txt","r");
while (!feof($file)){
	$char = fgetc($file);
	if($char == "a"){
		$count++;
	}
}
echo "A quantidade de caracteres 'a' foi de: ".$count;
fclose($file);
?>
