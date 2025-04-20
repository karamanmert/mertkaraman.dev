@import java.util.List
@import com.karamanmert.mypage.blog.Post
@param List<Post> posts
@param com.karamanmert.mypage.blog.Page page

@template.index(page = page, content = @`
    <div class="bg-white shadow rounded-lg p-6">
        @for(Post post : posts)
            <div class="border rounded-lg p-4 shadow-sm bg-gray-50" style="margin-bottom: 10px">
                <p class="text-xl font-semibold text-gray-800">${post.getTitle()}</p>
                <p class="text-gray-600 mt-2">${post.getContent()}</p>
                <img src="${post.getImageUrl()}" alt="${post.getTitle()}" class="mt-4 rounded-md" />
            </div>
        @endfor
    </div>
`)
