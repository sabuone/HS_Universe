<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/WEB-INF/views/include/common_top.jspf" %>

	<div id="container">
		<h2>게시판</h2>

		<div class="al_c login mgt_30">
			<table class="board">
			<colgroup>
				<col width="10%" />
				<col width="*" />
				<col width="10%" />
				<col width="20%" />
			</colgroup>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>조회</th>
				<th>일자</th>
			</tr>
			<tr>
				<td>999</td>
				<td align="left" style="padding-left:50px;"><a href="#">제목입니다</a></td>
				<td>50</td>
				<td>16.09.12</td>
			</tr>
			</table>
		</div>

		<div class="al_c mgt_30">
			<div class="pagination">
				<a href="#">&laquo;</a>
				<a href="#">1</a>
				<a href="#" class="active">2</a>
				<a href="#">3</a>
				<a href="#">4</a>
				<a href="#">5</a>
				<a href="#">6</a>
				<a href="#">&raquo;</a>
			</div>
		</div>

		<div class="al_r mgt_10">
			<button type="button" class="orange-btn" onclick="$('#writeModal').show();">글쓰기</button>
		</div>

		<div id="writeModal" class="modal">
			<form class="modal-content animate" action="/">
				<div style="position:relative; margin-top:10px;">
					<span onclick="$('#writeModal').hide();" class="close" title="닫기">&times;</span>
				</div>

				<table width="100%" class="mgt_30">
					<tr>
						<td><input type="text" name="" placeholder="제목을 입력하세요" /></td>
					</tr>
					<tr>
						<td><textarea name="" rows="15" placeholder="내용을 입력하세요"></textarea></td>
					</tr>
					<tr>
						<td>
							<button type="submit">작성</button>
						</td>
					</tr>
				</table>
			</form>
		</div>

		<!--
		<div id="viewModal" class="modal">
		</div>

		<div id="editModal" class="modal">
		</div>
		-->
	</div>
		
<%@ include file="/WEB-INF/views/include/common_bottom.jspf" %>