# Chris-Heavner-Portfolio-1
//Code Samples from Codecademy.com
//HTML Sample with Javascript
<!DOCTYPE html>
<html>
	<head>
		<title>GMC Jazz Trio</title>
	</head>
	<body style="background-color:burlywood; font-family:arial">
	    <img src='https://fbcdn-profile-a.akamaihd.net/hprofile-ak-frc3/t1/c18.14.172.172/p200x200/1234643_1414365382118921_985573705_n.jpg'/a>
	<p id="demo">GMC Jazz Trio is Guy on Saxes, Mike on Drums, And Chris on Keys </p>
	<script>
    function myFunction()
        {
        x=document.getElementById("demo") // Find the element
        x.style.color="#ff0000";          // Change the style
        }
    </script>
    <button type="button" onclick="myFunction()">Click Me!       </button>

	<ul style="color:blue">
	    <li style="font-size:24px"><strong>Musical Styles</strong></li>
	        <ol>
                <li>Jazz Standards</li>
	                <ul>
	                   <li>Don't Get Around Much Anymore</li>
	                        <ul><li><em>Duke Ellington</em></li></ul>
	                   <li>Satin Doll</li>
	                </ul>
	            <li>Motown/ Contemporary Jazz</li>
	                <ul>
	                   <li>Let's Stay Together</li>
	                   <ul><li><em>Al Green</em></li></ul>
	                </ul>
	        </ol>
	    <li>Location</li>
	    <li>Contact</li>
	</ul>
	</body>
</html>
