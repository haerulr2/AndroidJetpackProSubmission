package com.lowr4.movies.utils

import com.lowr4.movies.data.source.local.entity.MovieEntity
import com.lowr4.movies.data.source.local.entity.TvShowEntity
import com.lowr4.movies.data.source.remote.response.MovieResponse
import com.lowr4.movies.data.source.remote.response.TvShowResponse

object DataDummy {
    fun generateDummyMovie(): List<MovieEntity> {
        val movie = ArrayList<MovieEntity>()

        movie.add(MovieEntity(
            "m0",
            "Alita : Battle Angel",
            "Action, Science, Fiction, Adventure",
            "2 Jam 2 Menit",
            "02/14/2019 (US)",
            "Robert Rodriguez",
            "https://image.tmdb.org/t/p/w185/px5Yv69I5NtDxZofmJJ3rZf2bj.jpg",
            "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past."
        ))
        movie.add(MovieEntity(
            "m1",
            "Aquaman",
            "Action, Adventure, Fantasy",
            "2 Jam 24 Menit",
            "12/21/2018 (US)",
            "James Wan",
            "https://image.tmdb.org/t/p/w185/uCg2HPY7rBCrh1YGpXam9LH1xKZ.jpg",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne."
        ))
        movie.add(
            MovieEntity(
            "m2",
            "Bohemian Rhapsody",
            "Music, Drama, History",
            "2 Jam 15 Menit",
            "11/02/2018 (US)",
            "Bryan Singer",
            "https://image.tmdb.org/t/p/w185/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."
        ))
        movie.add(
            MovieEntity(
            "m3",
            "Cold Pursuite",
            "Action, Crime, Thriller",
            "1 Jam 59 Menit",
            "12/08/2019 (US)",
            "Hans Peter Moland",
            "https://image.tmdb.org/t/p/w185/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg",
            "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution."
        ))
        movie.add(
            MovieEntity(
            "m4",
            "Creed II",
            "Drama",
            "2 Jam 10 Menit",
            "11/21/2018 (US)",
            "Steven Caple Jr.",
            "https://image.tmdb.org/t/p/w185/qPQFWrLoQYyGxmeBgmpX901Q0mF.jpg",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life."
        ))
        movie.add(
            MovieEntity(
            "m5",
            "Fantastic Beasts: The Crimes of Grindelwald",
            "Adventure, Fantasy, Drama",
            "2 Jam 14 Menit",
            "11/16/2018 (US)",
            "David Yates",
            "https://image.tmdb.org/t/p/w185/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg",
            "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world."
        ))
        movie.add(
            MovieEntity(
            "m6",
            "Glass",
            "Thriller, Drama, Science Fiction",
            "2 Jam 9 Menit",
            "12/18/2019 (US)",
            "M. Night Shyamalan",
            "https://image.tmdb.org/t/p/w185/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg",
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men."
        ))
        movie.add(
            MovieEntity(
            "m7",
            "How to Train Your Dragon: The Hidden World",
            "Animation, Family, Adventure",
            "1 Jam 44 Menit",
            "02/22/2019 (US)",
            "Dean DeBlois",
            "https://image.tmdb.org/t/p/w185/ygGmAO60t8GyqUo9xYeYxSZAR3b.jpg",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."
            ))
        movie.add(
            MovieEntity(
            "m8",
            "Avenger: Infinity War",
            "Adventure, Action, Science Fiction",
            "2 Jam 29 Menit",
            "04/27/2018 (US)",
            "Joe Russo",
            "https://image.tmdb.org/t/p/w185/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."
        ))
        movie.add(
            MovieEntity(
            "m9",
            "Master Z",
            "Action",
            "1 Jam 47 Menit",
            "12/26/2018 (TW)",
            "Yuen Woo-ping",
            "https://image.tmdb.org/t/p/w185/7S0rXJPS15mZMWQieiRUf7WuReX.jpg",
            "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight."
        ))
        movie.add(
            MovieEntity(
            "m10",
            "Mortal Engines",
            "Adventure, Science Fiction",
            "2 Jam 9 Menit",
            "12/14/2018 (US)",
            "Christian Rivers",
            "https://image.tmdb.org/t/p/w185/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg",
            "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever."
        ))
        movie.add(
            MovieEntity(
            "m11",
            "Overload",
            "Horror, War, Science Fiction",
            "1 Jam 50 Menit",
            "11/09/2018 (US)",
            "Billy Ray",
            "https://image.tmdb.org/t/p/w185/zheRSqYlhD885GVAjG6K9i10Rfe.jpg",
            "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else."
        ))
        movie.add(
            MovieEntity(
            "m12",
            "Ralph Break The Internet",
            "Family, Animation, Comedy, Adventure",
            "1 Jam 57 Menit",
            "11/21/2018 (US)",
            "Phil Johnston",
            "https://image.tmdb.org/t/p/w185/dbvAUZWOepRxwUnSOvZAGsrPjta.jpg",
            "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube."
        ))
        movie.add(
            MovieEntity(
            "m13",
            "Robin Hood",
            "Adventure, Action, Thriller",
            "1 Jam 56 Menit",
            "11/21/2018 (US)",
            "Ben Chandler",
            "https://image.tmdb.org/t/p/w185/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg",
            "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."
            ))
        movie.add(
            MovieEntity(
            "m14",
            "Serenity",
            "Thriller, Mystery,Drama",
            "1 Jam 42 Menit",
            "01/25/2019 (US)",
            "Steven Knight",
            "https://image.tmdb.org/t/p/w185/hgWAcic93phg4DOuQ8NrsgQWiqu.jpg",
            "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help."
        ))
        movie.add(
            MovieEntity(
            "m15",
            "Spider-Man: Into the Spider-Verse",
            "Action, Adventure, Animation, Science Fiction, Comedy",
            "1 Jam 57 Menit",
            "12/14/2018 (US)",
            "Rodney Rothman",
            "https://image.tmdb.org/t/p/w185/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg",
            "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson 'Kingpin' Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."
        ))
        movie.add(
            MovieEntity(
            "m16",
            "T-34",
            "Action, Drama, History",
            "2 Jam 19 Menit",
            "01/01/2019 (RU)",
            "Alexey Sidorov",
            "https://image.tmdb.org/t/p/w185/dA6mPgdFMA03MjerpnndYytyKdT.jpg",
            "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles."
        ))
        return movie
    }

    fun generateDummyTvShow(): List<TvShowEntity> {
        val tvShow = ArrayList<TvShowEntity>()

        tvShow.add(TvShowEntity(
            "t0",
            "Arrow",
            "Crime, Drama, Mystery, Action & Adventure",
            "42 Menit",
            "22 Episodes",
            "Greg Berlanti",
            "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
            "https://image.tmdb.org/t/p/w185/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t1",
            "Doom Patrol",
            "Sci-Fi & Fantasy, Action & Adventure, Comedy",
            "49 Menit",
            "9 Episodes",
            "Jeremy Carver",
            "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
            "https://image.tmdb.org/t/p/w185/nclcURTdlqVbDr6HPmrHC5X4qUu.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t2",
            "Dragon Ball",
            "Comedy, Sci-Fi & Fantasy, Animationm Action & Adventure",
            "25 Menit",
            "153 Episodes",
            "Akira Toriyama",
            "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
            "https://image.tmdb.org/t/p/w185/eg2CakFFQh3dvujVj2qYCe7ybvK.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t3",
            "Fairy Tail",
            "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy",
            "25 Menit",
            "51 Episodes",
            "-",
            "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
            "https://image.tmdb.org/t/p/w185/yALr5dH77suFz4klaWsPzCbPOai.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t4",
            "Family Guy",
            "Animation, Comedy",
            "22 Menit",
            "13 Episodes",
            "Seth MacFarlane",
            "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
            "https://image.tmdb.org/t/p/w185/q3E71oY6qgAEiw6YZIHDlHSLwer.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t5",
            "The Flash",
            "Drama, Sci-Fi & Fantasy",
            "44 Menit",
            "5 Episodes",
            "Greg Berlanti",
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only 'meta-human' who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
            "https://image.tmdb.org/t/p/w185/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t6",
            "Gotham",
            "Drama, Fantasy, Crime",
            "43 Menit",
            "12 Episodes",
            "Bruno Heller",
            "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
            "https://image.tmdb.org/t/p/w185/5tSHzkJ1HBnyGdcpr6wSyw7jYnJ.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t7",
            "Grey's Anatomy",
            "Drama",
            "43 Menit",
            "Shonda Rhimes",
            "7 Episodes",
            "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
            "https://image.tmdb.org/t/p/w185/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t8",
            "Hanna",
            "Action & Adventure, Drama",
            "50 Menit",
            "8 Episodes",
            "David Farr",
            "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
            "https://image.tmdb.org/t/p/w185/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t9",
            "Marvel's Iron Fist",
            "Action & Adventure, Drama, Sci-Fi & Fantasy",
            "55 Menit",
            "10 Episodes",
            "Scott Buck",
            "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
            "https://image.tmdb.org/t/p/w185/rioMBKotMSu2lRIpGAaGRiDauAe.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t10",
            "Naruto Shippuden",
            "Animation, Action & Adventure, Sci-Fi & Fantasy",
            "25 Menit",
            "87 Episodes",
            "-",
            "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
            "https://image.tmdb.org/t/p/w185/vaEX9f8ud7iF0G7EoyGxAyRNV1p.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t11",
            "NCIS",
            "Crime, Action & Adventure, Drama",
            "45 Menit",
            "7 Episodes",
            "Donald p. Bellisario",
            "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
            "https://image.tmdb.org/t/p/w185/fi8EvaWtL5CvoielOjjVvTr7ux3.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t12",
            "Riverdale",
            "Mystery, Drama, Crime",
            "45 Menit",
            "7 Episodes",
            "Roberto Aguirre-Sacasa",
            "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
            "https://image.tmdb.org/t/p/w185/pHcNHYPg0c2vg7qay6wjJoApUgS.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t13",
            "Shameless",
            "Drama, Comedy",
            "1 Jam",
            "5 Episodes",
            "Paul Abbott",
            "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.",
            "https://image.tmdb.org/t/p/w185/kE30UWJvJZ03KIIJMmL6m6YoG0l.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t14",
            "Supergirl",
            "Action, Adventure, Drama, Science Fiction",
            "42 Menit",
            "19 Episodes",
            "Greg Berlanti",
            "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
            "https://image.tmdb.org/t/p/w185/vqBsgL9nd2v04ZvCqPzwtckDdFD.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t15",
            "Supernatural",
            "Drama, Mystery, Sci-Fi & Fantasy",
            "45 Menit",
            "20 Episodes",
            "Eric Kripke",
            "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
            "https://image.tmdb.org/t/p/w185/pui1V389cQft0BVFu9pbsYLEW1Q.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t16",
            "The Simpsons",
            "Family, Animation, Comedy, Drama",
            "22 Menit",
            "19 Episodes",
            "Matt Groening",
            "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
            "https://image.tmdb.org/t/p/w185/k5UALlcA0EnviaCUn2wMjOWYiOO.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t17",
            "The Umbrella Academy",
            "Action & Adventure, Sci-Fi & Fantasy, Drama",
            "55 Menit",
            "10 Episodes",
            "Steve Blackman",
            "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
            "https://image.tmdb.org/t/p/w185/uYHdIs5O8tiU5p6MvUPd2jElOH6.jpg"
            ))
        tvShow.add(TvShowEntity(
            "t18",
            "The Walking Dead",
            "Action & Adventure, Drama, Sci-Fi & Fantasy",
            "42 Menit",
            "22 Episodes",
            "Frank Darabont",
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            "https://image.tmdb.org/t/p/w185/reKs8y4mPwPkZG99ZpbKRhBPKsX.jpg"
            ))

        return tvShow
    }

    fun generateRemoteDummyMovie(): List<MovieResponse> {
        val movie = ArrayList<MovieResponse>()

        movie.add(MovieResponse(
                "m0",
                "Alita : Battle Angel",
                "Action, Science, Fiction, Adventure",
                "2 Jam 2 Menit",
                "02/14/2019 (US)",
                "Robert Rodriguez",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "https://image.tmdb.org/t/p/w185/px5Yv69I5NtDxZofmJJ3rZf2bj.jpg"
        ))
        movie.add(MovieResponse(
                "m1",
                "Aquaman",
                "Action, Adventure, Fantasy",
                "2 Jam 24 Menit",
                "12/21/2018 (US)",
                "James Wan",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "https://image.tmdb.org/t/p/w185/uCg2HPY7rBCrh1YGpXam9LH1xKZ.jpg"
        ))
        movie.add(
                MovieResponse(
                        "m2",
                        "Bohemian Rhapsody",
                        "Music, Drama, History",
                        "2 Jam 15 Menit",
                        "11/02/2018 (US)",
                        "Bryan Singer",
                        "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                        "https://image.tmdb.org/t/p/w185/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m3",
                        "Cold Pursuite",
                        "Action, Crime, Thriller",
                        "1 Jam 59 Menit",
                        "12/08/2019 (US)",
                        "Hans Peter Moland",
                        "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                        "https://image.tmdb.org/t/p/w185/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m4",
                        "Creed II",
                        "Drama",
                        "2 Jam 10 Menit",
                        "11/21/2018 (US)",
                        "Steven Caple Jr.",
                        "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                        "https://image.tmdb.org/t/p/w185/qPQFWrLoQYyGxmeBgmpX901Q0mF.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m5",
                        "Fantastic Beasts: The Crimes of Grindelwald",
                        "Adventure, Fantasy, Drama",
                        "2 Jam 14 Menit",
                        "11/16/2018 (US)",
                        "David Yates",
                        "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                        "https://image.tmdb.org/t/p/w185/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m6",
                        "Glass",
                        "Thriller, Drama, Science Fiction",
                        "2 Jam 9 Menit",
                        "12/18/2019 (US)",
                        "M. Night Shyamalan",
                        "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                        "https://image.tmdb.org/t/p/w185/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m7",
                        "How to Train Your Dragon: The Hidden World",
                        "Animation, Family, Adventure",
                        "1 Jam 44 Menit",
                        "02/22/2019 (US)",
                        "Dean DeBlois",
                        "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                        "https://image.tmdb.org/t/p/w185/ygGmAO60t8GyqUo9xYeYxSZAR3b.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m8",
                        "Avenger: Infinity War",
                        "Adventure, Action, Science Fiction",
                        "2 Jam 29 Menit",
                        "04/27/2018 (US)",
                        "Joe Russo",
                        "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                        "https://image.tmdb.org/t/p/w185/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m9",
                        "Master Z",
                        "Action",
                        "1 Jam 47 Menit",
                        "12/26/2018 (TW)",
                        "Yuen Woo-ping",
                        "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                        "https://image.tmdb.org/t/p/w185/7S0rXJPS15mZMWQieiRUf7WuReX.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m10",
                        "Mortal Engines",
                        "Adventure, Science Fiction",
                        "2 Jam 9 Menit",
                        "12/14/2018 (US)",
                        "Christian Rivers",
                        "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                        "https://image.tmdb.org/t/p/w185/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m11",
                        "Overload",
                        "Horror, War, Science Fiction",
                        "1 Jam 50 Menit",
                        "11/09/2018 (US)",
                        "Billy Ray",
                        "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                        "https://image.tmdb.org/t/p/w185/zheRSqYlhD885GVAjG6K9i10Rfe.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m12",
                        "Ralph Break The Internet",
                        "Family, Animation, Comedy, Adventure",
                        "1 Jam 57 Menit",
                        "11/21/2018 (US)",
                        "Phil Johnston",
                        "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                        "https://image.tmdb.org/t/p/w185/dbvAUZWOepRxwUnSOvZAGsrPjta.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m13",
                        "Robin Hood",
                        "Adventure, Action, Thriller",
                        "1 Jam 56 Menit",
                        "11/21/2018 (US)",
                        "Ben Chandler",
                        "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                        "https://image.tmdb.org/t/p/w185/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m14",
                        "Serenity",
                        "Thriller, Mystery,Drama",
                        "1 Jam 42 Menit",
                        "01/25/2019 (US)",
                        "Steven Knight",
                        "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                        "https://image.tmdb.org/t/p/w185/hgWAcic93phg4DOuQ8NrsgQWiqu.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m15",
                        "Spider-Man: Into the Spider-Verse",
                        "Action, Adventure, Animation, Science Fiction, Comedy",
                        "1 Jam 57 Menit",
                        "12/14/2018 (US)",
                        "Rodney Rothman",
                        "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson 'Kingpin' Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                        "https://image.tmdb.org/t/p/w185/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg"
                ))
        movie.add(
                MovieResponse(
                        "m16",
                        "T-34",
                        "Action, Drama, History",
                        "2 Jam 19 Menit",
                        "01/01/2019 (RU)",
                        "Alexey Sidorov",
                        "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                        "https://image.tmdb.org/t/p/w185/dA6mPgdFMA03MjerpnndYytyKdT.jpg"
                ))
        return movie
    }

    fun generateRemoteDummyTvShow(): List<TvShowResponse> {
        val tvShow = ArrayList<TvShowResponse>()

        tvShow.add(TvShowResponse(
                "t0",
                "Arrow",
                "Crime, Drama, Mystery, Action & Adventure",
                "42 Menit",
                "22 Episodes",
                "Greg Berlanti",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "https://image.tmdb.org/t/p/w185/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t1",
                "Doom Patrol",
                "Sci-Fi & Fantasy, Action & Adventure, Comedy",
                "49 Menit",
                "9 Episodes",
                "Jeremy Carver",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                "https://image.tmdb.org/t/p/w185/nclcURTdlqVbDr6HPmrHC5X4qUu.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t2",
                "Dragon Ball",
                "Comedy, Sci-Fi & Fantasy, Animationm Action & Adventure",
                "25 Menit",
                "153 Episodes",
                "Akira Toriyama",
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                "https://image.tmdb.org/t/p/w185/eg2CakFFQh3dvujVj2qYCe7ybvK.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t3",
                "Fairy Tail",
                "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy",
                "25 Menit",
                "51 Episodes",
                "-",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                "https://image.tmdb.org/t/p/w185/yALr5dH77suFz4klaWsPzCbPOai.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t4",
                "Family Guy",
                "Animation, Comedy",
                "22 Menit",
                "13 Episodes",
                "Seth MacFarlane",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                "https://image.tmdb.org/t/p/w185/q3E71oY6qgAEiw6YZIHDlHSLwer.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t5",
                "The Flash",
                "Drama, Sci-Fi & Fantasy",
                "44 Menit",
                "5 Episodes",
                "Greg Berlanti",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only 'meta-human' who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "https://image.tmdb.org/t/p/w185/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t6",
                "Gotham",
                "Drama, Fantasy, Crime",
                "43 Menit",
                "12 Episodes",
                "Bruno Heller",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                "https://image.tmdb.org/t/p/w185/5tSHzkJ1HBnyGdcpr6wSyw7jYnJ.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t7",
                "Grey's Anatomy",
                "Drama",
                "43 Menit",
                "Shonda Rhimes",
                "7 Episodes",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "https://image.tmdb.org/t/p/w185/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t8",
                "Hanna",
                "Action & Adventure, Drama",
                "50 Menit",
                "8 Episodes",
                "David Farr",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                "https://image.tmdb.org/t/p/w185/5nSSkcM3TgpllZ7yTyBOQEgAX36.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t9",
                "Marvel's Iron Fist",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "55 Menit",
                "10 Episodes",
                "Scott Buck",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                "https://image.tmdb.org/t/p/w185/rioMBKotMSu2lRIpGAaGRiDauAe.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t10",
                "Naruto Shippuden",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "25 Menit",
                "87 Episodes",
                "-",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                "https://image.tmdb.org/t/p/w185/vaEX9f8ud7iF0G7EoyGxAyRNV1p.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t11",
                "NCIS",
                "Crime, Action & Adventure, Drama",
                "45 Menit",
                "7 Episodes",
                "Donald p. Bellisario",
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                "https://image.tmdb.org/t/p/w185/fi8EvaWtL5CvoielOjjVvTr7ux3.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t12",
                "Riverdale",
                "Mystery, Drama, Crime",
                "45 Menit",
                "7 Episodes",
                "Roberto Aguirre-Sacasa",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "https://image.tmdb.org/t/p/w185/pHcNHYPg0c2vg7qay6wjJoApUgS.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t13",
                "Shameless",
                "Drama, Comedy",
                "1 Jam",
                "5 Episodes",
                "Paul Abbott",
                "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.",
                "https://image.tmdb.org/t/p/w185/kE30UWJvJZ03KIIJMmL6m6YoG0l.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t14",
                "Supergirl",
                "Action, Adventure, Drama, Science Fiction",
                "42 Menit",
                "19 Episodes",
                "Greg Berlanti",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "https://image.tmdb.org/t/p/w185/vqBsgL9nd2v04ZvCqPzwtckDdFD.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t15",
                "Supernatural",
                "Drama, Mystery, Sci-Fi & Fantasy",
                "45 Menit",
                "20 Episodes",
                "Eric Kripke",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "https://image.tmdb.org/t/p/w185/pui1V389cQft0BVFu9pbsYLEW1Q.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t16",
                "The Simpsons",
                "Family, Animation, Comedy, Drama",
                "22 Menit",
                "19 Episodes",
                "Matt Groening",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "https://image.tmdb.org/t/p/w185/k5UALlcA0EnviaCUn2wMjOWYiOO.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t17",
                "The Umbrella Academy",
                "Action & Adventure, Sci-Fi & Fantasy, Drama",
                "55 Menit",
                "10 Episodes",
                "Steve Blackman",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                "https://image.tmdb.org/t/p/w185/uYHdIs5O8tiU5p6MvUPd2jElOH6.jpg"
        ))
        tvShow.add(TvShowResponse(
                "t18",
                "The Walking Dead",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "42 Menit",
                "22 Episodes",
                "Frank Darabont",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "https://image.tmdb.org/t/p/w185/reKs8y4mPwPkZG99ZpbKRhBPKsX.jpg"
        ))

        return tvShow
    }

    fun generateDummyMovieById(id:String): MovieEntity? {
        var movie: MovieEntity? = null
        val movieEntity = generateDummyMovie()
        for (i in 0 until movieEntity.size -1){
            val movieItem = generateDummyMovie()[i]
            if (movieItem.id == id) movie = movieItem
        }
        return movie
    }

    fun generateDummyTvShowById(id:String): TvShowEntity? {
        var tvShow: TvShowEntity? = null
        val tvShowEntity = generateDummyTvShow()
        for (i in 0 until tvShowEntity.size -1){
            val tvShowItem = generateDummyTvShow()[i]
            if (tvShowItem.id == id) tvShow = tvShowItem
        }
        return tvShow
    }
}