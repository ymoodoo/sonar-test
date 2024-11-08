@param String title
@param String heading
@param String message

<!DOCTYPE html>
<html>
<head>
    <title>${title}</title>
</head>
<body>
@if(heading.equals("test"))
    <h1>we are testing</h1>
@else
    <h1>${heading}</h1>
@endif
<p>${message}</p>
</body>
</html>
