@param com.karamanmert.mypage.blog.Page page
@param gg.jte.Content content

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mert Karaman</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<div class="min-h-screen flex flex-col items-center px-10">
    <header class="text-center my-8">
        <h1 class="text-4xl font-bold">${page.title()}</h1>
        <p class="text-gray-600">${page.description()}</p>
        <nav class="mt-6 bg-blue-100 p-4 rounded">
            <ul class="flex justify-center space-x-6 font-semibold text-blue-800">
                <li><a href="/" class="flex items-center gap-2"><img src="/images/home.svg" width="15">Home</a></li>
                <li><a href="/posts">Post</a></li>
                <li><a href="/contact">Contact</a></li>
            </ul>
        </nav>
    </header>

    <main class="w-full max-w-4xl space-y-10; w-full max-w-4xl space-y-10 overflow-x-hidden break-words">
        <div class="prose max-w-full overflow-x-hidden break-words">
            ${content}
        </div>
    </main>

    @template.footer()
</div>
</body>
</html>