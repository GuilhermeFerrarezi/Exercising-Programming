<?php
$file = fopen("nome.txt","r");
while (!feof($file)){
	$char = fgetc($file);
	if($char == "a"){
		$char = "x";
	}
	echo "$char";
}
fclose($file);
?>
