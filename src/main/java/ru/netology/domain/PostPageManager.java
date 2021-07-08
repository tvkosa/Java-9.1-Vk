package ru.netology.domain;

public class PostPageManager {
    private int postId;
    private int idAuthor;
    private String nameAuthor;
    private String avatarAuthor;
    private String postDate;
    private String namePost;
    private String postText;
    private boolean addFavourites;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private Repost repost;
    private ViewsInfo viewsInfo;

    //добавляю поля
    private String postType; //тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private int signerId; //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int canPin; //информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    private int canDelete; //информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
    private int canEdit; // информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
    private int isPinned; // информация о том, что запись закреплена.
    private int markedAsAds; // содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private int postponedId; // идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.

    private Copyright copyright;
    private Donut donut;
    private Geo geo;

}
// + get/set на все поля


